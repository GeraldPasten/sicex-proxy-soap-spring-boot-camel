# sicex-base-spring-boot-camel

##### Descripción: Proxy Service REST base REST to SOAP Spring-Boot Apache Camel Integración

## Instalación

	Requerido: Open JDK 1.8 , Maven 1.8.0_162

Para ejecutar a nivel local: 

	mvn spring-boot:run -Dspring-boot.run.profiles=local
	
Este servicio posee las operaciones asociadas:

	curl http://0.0.0.0:8082/api/v1/sicexproxy/sna/example --data '{"atributo":"1234567890"}' -H "Content-Type: application/json" -> base de ejemplo de estructura de servicios

### Dependencies

DATABASES: TEST

### Local environment

Para la ejecución local se implementan el properties con valores pre-asignados:

	/src/main/resources/application-local.properties

### Openshift environment (configmap)

En Openshift se obtienen los properties de config maps (0-bd-confgimap y 0-sicex-base-ep) los que son seteados en el /src/main/resources/application.properties

