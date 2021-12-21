# Locadora Noca Veículos

Locadora Noca é uma locadora de veículos fictícia que representa uma implementação de uma solução em software consistente e funcional de uma locadora de veículos convencional como aplicação WEB.
A Noca Corporation dispõe de automóveis e motocicletas. Os planos são baseados no modelo e características dos veículos.
Os planos são de A a G para automóveis e A a D para motocicletas.

## Notas desta Versão
O projeto apresenta seis CRUDs. sendo eles LOCAÇÕES, AGENCIAS, CARROS, MOTOS, CLIENTES e FUNCIONÁRIOS. A camada EVENTOS foi retirada nesta versão, pois esta não é mais utilizada como template para o restante do projeto.
Todos os CRUDS estão operando corretamente, exceto o LOCAÇÕES, pois este encontra-se parcialmente implementado. Porém, é possível CRIAR e VISUALIZAR os respectivos valores, tanto na aplicação, quanto na base de dados.

o JavaDocs encontra-se na seguinte pasta abaixo:

```
/doc
```

O arquivo para insersão da base de dados encontra-se no seguinte diretório abaixo:

```
\src\main\resources
```

Para que este arquivo de script opere automaticamente, é necessário configurar o arquivo application.properties para o modo "create-drop" apenas na primeira execução. A partir da segunda, recomenda-se o uso do "update".

```
spring.jpa.hibernate.ddl-auto = create-drop
spring.jpa.hibernate.ddl-auto = update
```

## Começando

Essas instruções irão possibilitar que você tenha uma cópia do projeto em execução na sua máquina local para fins de desenvolvimento e testes.

### Pré requisitos

O que você precisa para rodar o software é instalar:

```
MySQL Server 8.0
Java JDK 1.8.0_181
Java JRE 1.8.0_181
```

### Instalação

Para startar o projeto para seu computador, siga as seguintes instruções:

Baixar este projeto em formato .zip.

```
Clone or Download > Download ZIP
```

Extrair  o projeto para seu workspace folder.

No exclipse, importar o projeto como projeto MAVEN seguindo os passos abaixo

```
File > Import >  Maven > Existing Maven Projects (next) 
```

Navegar até o diretório que encontra-se a pasta do projeto que foi extraído (brouse)

```
File > Import >  Maven > Existing Maven Projects (next) > Finish
```

## Informações de Configuração dos Pacotes

Utilizar o MySql versão 8 instalado na máquina.
Criar manualmente um database denominado locadoranoca (create database locadoranoca;) antes de iniciar a aplicação.
Login do MySql: root
Senha do MySql: 123456
Para qualquer outra observbação, inspecionar o arquibo "application.properties" e também o "pom.xml".

## Rodando a aplicação

Após importar o projeto, o Maven irá fazer o downloads das dependências necessárias e isso levará alguns minutos, conforme informação na barra inferior esquerda do eclipse (Progress).

### Startando  a licação WEB

Executar a seguinte classe (Run As Java Application).

```
locadoraveiculos > com.locadoraveiculos > LocadoraVeiculosApplication.java
```

### No seu navegador, executar a seguinte uel:.

```
http://localhost:8080/
```

## Tecnologias Utilizadas

```
Spring Boot, Materialize, Hibernate, MySQL, Maven, JPA, 
```

## Author

**Widson Melo**

```
Github https://github.com/WidsonMelo
Google Sites: https://sites.google.com/view/widson-melo
```

## Licença de uso

Este projeto está disponível neste repositório (https://github.com/WidsonMelo/locadoraveiculos) e foi desenvolvido na disciplina de Desenvolvimento WEB.
Pode ser usado e distribuído para outros estudantes conforme a necessidade. Use o bom senso e dê os devidos créditos para o autor, ao qual se esforçou bastante para desenvolvê-lo.
Por fim, este projeto pode ser usado e distribuído livremente sem nenhum custo.

## Agradecimentos

* Aos colegas da UEPB e da disciplina de Programação WEB pela força.
* Ao professores envolvidos na disciplina, em especial o Professor Thiago Santana
* Ao https://stackoverflow.com/ (srsrrsrs)# Isaac-senai-aluguel_carro
