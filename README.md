# iCausasAPI
## API Spring Boot com Swagger

# Nome do arquivo: *AcademicRecords*
Este é um guia passo a passo para colocar em funcionamento uma API Spring Boot que utiliza o Swagger para documentação e testes interativos.

![Crud implementado](https://github.com/williamsilvaj/iCausasAPI/assets/119798187/fbf69f9f-1ec3-4e70-a978-707408c52e1f)

### Pré-requisitos

Antes de começar, certifique-se de que você tenha o seguinte instalado em sua máquina:

- Java JDK
- Maven

### Instruções

Siga estas etapas para configurar e executar a API Spring Boot:

1. Clone ou faça o download deste repositório.

2. Abra o terminal e navegue até o diretório raiz do projeto.

*AcademicRecords/src/main/java/com/example/AcademicRecords/configurations/DataSourceConfig.java*

2.1 Neste endereço *AcademicRecords/src/main/java/com/example/AcademicRecords/configurations/DataSourceConfig.java* terá o campo *dataSource.setUrl("jdbc:sqlite:coloque o caminho para o banco de dado aqui");* .

  O banco de dados está na pasta *AcademicRecords/DatabaseSQLite/AcademicRecordsDB* junto com o código SQL sepadado. 

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
![Swagger](https://github.com/williamsilvaj/iCausasAPI/assets/119798187/b680cb5e-be30-4408-b2d6-ad770c6aa8b5)

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

Você verá a interface do Swagger, que permite explorar e testar os endpoints da API.

Pronto! Sua API Spring Boot com Swagger agora está em execução e pronta para uso.
