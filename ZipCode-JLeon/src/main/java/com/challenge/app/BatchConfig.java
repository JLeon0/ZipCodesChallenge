package com.challenge.app;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.challenge.app.models.Pojo_ZipCode;
 
@Configuration
@EnableBatchProcessing
public class BatchConfig {
     
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
 
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    
	@Autowired
	public DataSource dataSource;
 
    @Bean
    public Job readCSVFileJob() {
        return jobBuilderFactory
                .get("readCSVFileJob")
                .incrementer(new RunIdIncrementer())
                .start(step())
                .build();
    }
 
    @Bean
    public Step step() {
        return stepBuilderFactory
                .get("step")
                .<Pojo_ZipCode, Pojo_ZipCode>chunk(5)
                .reader(reader())
                .writer(writer())
                .build();
    }
     
     
    @Bean
    public FlatFileItemReader<Pojo_ZipCode> reader() {
        FlatFileItemReader<Pojo_ZipCode> itemReader = new FlatFileItemReader<Pojo_ZipCode>();
        itemReader.setLineMapper(lineMapper());
        itemReader.setLinesToSkip(1);
        itemReader.setResource(new ClassPathResource("Mexico.csv"));
        return itemReader;
    }
 
    @Bean
    public LineMapper<Pojo_ZipCode> lineMapper() {
        DefaultLineMapper<Pojo_ZipCode> lineMapper = new DefaultLineMapper<Pojo_ZipCode>();
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setNames(new String[]{ "d_codigo", "d_asenta", "d_tipo_asenta", "D_mnpio", "d_estado", "d_ciudad", "d_CP",
        		"c_estado", "c_oficina", "c_CP", "c_tipo_asenta", "c_mnpio", "id_asenta_cpcons", "d_zona", "c_cve_ciudad"});
        BeanWrapperFieldSetMapper<Pojo_ZipCode> fieldSetMapper = new BeanWrapperFieldSetMapper<Pojo_ZipCode>();
        fieldSetMapper.setTargetType(Pojo_ZipCode.class);
        lineMapper.setLineTokenizer(lineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);
        return lineMapper;
    }
 
    @Bean
    public JdbcBatchItemWriter<Pojo_ZipCode> writer() {
        JdbcBatchItemWriter<Pojo_ZipCode> itemWriter = new JdbcBatchItemWriter<Pojo_ZipCode>();
        itemWriter.setDataSource(dataSource);
        itemWriter.setSql("INSERT INTO Pojo_ZipCode(d_asenta, d_tipo_asenta, D_mnpio, d_estado, d_ciudad, d_CP, c_estado, c_oficina, "
        		+ "c_CP, c_tipo_asenta, c_mnpio, id_asenta_cpcons, d_zona, c_cve_ciudad) "
        		+ "VALUES(:d_asenta, :d_tipo_asenta, :D_mnpio, :d_estado, :d_ciudad, :d_CP, :c_estado, :c_oficina, "
        		+ ":c_CP, :c_tipo_asenta, :c_mnpio, :id_asenta_cpcons, :d_zona, :c_cve_ciudad)");
        itemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Pojo_ZipCode>());
        return itemWriter;
    }
   
}