# Solução do exercício de TDD

# Sobre o projeto

 - É um projeto referente ao desafio do bootcamp da **Dev Superior**.
 
 - Consiste basicamente na implementação das funcionalidades para ques teste de integração possam passar.
 
 - Este é um sistema de eventos e cidades com uma relação N-1 entre eles.
 
 - Foram feito teste de integração da camada **web(Resources)**

# Enunciado do desafio 
  ## Desafio TDD para entregar
  **TAREFA: TDD Event-City**

  ### Implemente as funcionalidades necessárias para que os testes do projeto abaixo passem:
      https://github.com/devsuperior/bds02

  ### Collection do Postman:
      https://www.getpostman.com/collections/c347ea3428d6b199b391

  **Mínimo para aprovação: 5/7**

# Endpoints implementados :

  ### Busca de cidades ordenadas por nome
  ```
  GET /cities
  ```

  ### Inserção de uma nova cidade
  ```
  POST /cities
  {
    "name": "Valença"
  }
  ```

  ### Atualização de um evento
  ```
  PUT /events/2
  {
    "name": "Example",
    "url": "https://example.com.br",
    "data": 2022-06-29,
    "cityId": 2
  }
  ```

# Tecnologias utilizadas 
 
## Back-end 
- Java
- Maven 
- Spring Data JPA
- Spring MVC
- Spring Boot
- Junit 
  
# Autor 
 
Rafael Amaral De Paula

LINKEDIN
-https://www.linkedin.com/in/rafael-amaral-449558148/

YOUTUBE
-https://www.youtube.com/channel/UC2QC0Jpjn1f0gHkk0TvvL_g


