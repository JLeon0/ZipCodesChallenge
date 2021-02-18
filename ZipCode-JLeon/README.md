################## ZipCode-JLeon ##################

### DESCRIPCION
-El siguiente proyecto fue hecho con herramientas de spring framework,con la finalidad de buscar codigos postales del Estado de Mexico.
-Al iniciar se carga localmente (H2 Database) el archivo con los codigos y mediante un REST API endpoint se obtiene el resultado.

#### NECESARIO
- Spring Tools suite 4
- Se realizó con Java 11

### EJECUCION
- Clic derecho al proyecto
- run as -> spring boot app
- El servicio cargará automaticamente la informacion

#DEPLOY GOOGLE CLOUD
	https://zipcode-jleon.wn.r.appspot.com
	
### PRUEBAS
-Navegador:
	Navegador de su preferencia...
	Ingresamos la siguiente url :: http://localhost:8080/zip-codes/105 o https://zipcode-jleon.wn.r.appspot.com/zip-codes/105
-Postman:
	Abrimos una nueva pestaña de tipo GET...
	Ingresamos la siguiente url :: http://localhost:8080/zip-codes/105
	