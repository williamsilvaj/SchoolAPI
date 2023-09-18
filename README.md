# AcademicRecordsAPI

# AcademicRecordsAPI

## API Spring Boot com Swagger

Este é um guia passo a passo para colocar em funcionamento uma API Spring Boot que utiliza o Swagger para documentação e testes interativos.

### Pré-requisitos

Antes de começar, certifique-se de que você tenha o seguinte instalado em sua máquina:

- Java JDK
- Maven

### Instruções

Siga estas etapas para configurar e executar a API Spring Boot:

1. Clone ou faça o download deste repositório.

2. Abra o terminal e navegue até o diretório raiz do projeto.

*AcademicRecords/src/main/java/com/example/AcademicRecords/configurations/DataSourceConfig.java*
Neste endereço terá dataSource.setUrl("jdbc:sqlite:coloque o caminho para o banco de dado aqui"); // Replace with your database

O banco de dados está na *AcademicRecords/DatabaseSQLite/AcademicRecordsDB* junto com o código SQL sepadado. 

3. Certifique-se de que você possui o Maven instalado. Para verificar, execute o seguinte comando:

*mvn -v*

Isso deve exibir informações sobre a versão do Maven instalada.

4. Compile o projeto usando o Maven:

*mvn clean install*

Isso irá compilar o projeto e baixar todas as dependências necessárias.

5. Após a conclusão da compilação, execute o aplicativo Spring Boot:

*mvn spring-boot:run*


O aplicativo será iniciado na porta padrão 8080.

6. Abra seu navegador da web e acesse a documentação Swagger em:

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

Você verá a interface do Swagger, que permite explorar e testar os endpoints da API.

Pronto! Sua API Spring Boot com Swagger agora está em execução e pronta para uso.

