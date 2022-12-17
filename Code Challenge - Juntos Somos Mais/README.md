# Projeto Full-stack - API Java (Code Challenge Juntos Somos+)

Esse projeto, apresenta o trabalho final desenvolvido dentro da disciplina de Linguagem de Programação II, do Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas (TADS), no Instituto Federal de Educação, Ciência e Tecnologia de São Paulo - IFSP.

# O desafio


Recebemos insumos de clientes via arquivo CSV das empresas participantes todo mês, contudo, recebemos de alguns no formato JSON.

Exemplo do CSV:

```
gender,name.title,name.first,name.last,location.street,location.city,location.state,location.postcode,location.coordinates.latitude,location.coordinates.longitude,location.timezone.offset,location.timezone.description,email,dob.date,dob.age,registered.date,registered.age,phone,cell,picture.large,picture.medium,picture.thumbnail
male,mr,joselino,alves,2095 rua espirito santo ,são josé de ribamar,paraná,96895,-35.8687,-131.8801,-10:00,Hawaii,joselino.alves@example.com,1996-01-09T02:53:34Z,22,2014-02-09T19:19:32Z,4,(97) 0412-1519,(94) 6270-3362,https://randomuser.me/api/portraits/men/75.jpg,https://randomuser.me/api/portraits/med/men/75.jpg,https://randomuser.me/api/portraits/thumb/men/75.jpg
```
Exemplo do JSON:

```
{"gender":"male","name":{"title":"mr","first":"antonelo","last":"da conceição"},"location":{"street":"8986 rua rui barbosa ","city":"santo andré","state":"alagoas","postcode":40751,"coordinates":{"latitude":"-69.8704","longitude":"-165.9545"},"timezone":{"offset":"+1:00","description":"Brussels, Copenhagen, Madrid, Paris"}},"email":"antonelo.daconceição@example.com","dob":{"date":"1956-02-12T10:38:37Z","age":62},"registered":{"date":"2005-12-05T15:22:53Z","age":13},"phone":"(85) 8747-8125","cell":"(87) 2414-0993","picture":{"large":"https://randomuser.me/api/portraits/men/8.jpg","medium":"https://randomuser.me/api/portraits/med/men/8.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/8.jpg"}}
```

## Regras de negócio

Os clientes foram divididos pelas **5 regiões do país**: 

- Norte
- Nordeste
- Centro-Oeste
- Sudeste
- Sul

 Classificação de acordo com os **rótulos** (bounding boxes):

- **ESPECIAL**

```
minlon: -2.196998
minlat -46.361899
maxlon: -15.411580
maxlat: -34.276938
```
```
minlon: -19.766959
minlat -52.997614
maxlon: -23.966413
maxlat: -44.428305
```

- **NORMAL**

```
minlon: -26.155681
minlat -54.777426
maxlon: -34.016466
maxlat: -46.603598
```

- **TRABALHOSO** 
```
Qualquer outro usuário que não se encaixa nas regras acima
```

Tratamento dos registros **CSVs** e **JSONs**:

1. Transformar os contatos telefônicos no formato [E.164](https://en.wikipedia.org/wiki/E.164). Exemplo: (86) 8370-9831 vira +558683709831.
2. Inserir a nacionalidade. Como todos os clientes ainda são do brasil, o valor padrão será BR.
3. Alterar o valor do campo `gender` para `F` ou `M` em vez de `female` ou `male`.
4. Retirar o campo `age` de `dob` e `registered`.
5. Alterar estrutura para simplificar leitura e usar arrays em campos específicos (ver exemplo abaixo)

Exemplo de contrato de OUTPUT:

```
{
  "type": "laborious"
  "gender": "m",
  "name": {
    "title": "mr",
    "first": "quirilo",
    "last": "nascimento"
  },
  "location": {
    "region": "sul"
    "street": "680 rua treze ",
    "city": "varginha",
    "state": "paraná",
    "postcode": 37260,
    "coordinates": {
      "latitude": "-46.9519",
      "longitude": "-57.4496"
    },
    "timezone": {
      "offset": "+8:00",
      "description": "Beijing, Perth, Singapore, Hong Kong"
    }
  },
  "email": "quirilo.nascimento@example.com",
  "birthday": "1979-01-22T03:35:31Z",
  "registered": "2005-07-01T13:52:48Z",
  "telephoneNumbers": [
    "+556629637520"
  ],
  "mobileNumbers": [
    "+553270684089"
  ],
  "picture": {
    "large": "https://randomuser.me/api/portraits/men/83.jpg",
    "medium": "https://randomuser.me/api/portraits/med/men/83.jpg",
    "thumbnail": "https://randomuser.me/api/portraits/thumb/men/83.jpg"
  },
  "nationality": "BR"
}

```

**Os dados devem ser armazenados conforme o contrato de OUTPUT também.**

## Funcionamento da API

Dada a **região do usuário** e seu **tipo de classificação**, responda a **listagem dos elegíveis**.

Toda manipulação dos dados é feita **em memória**. O carregamento dos dados de input é feita por meio de request HTTP **ao subir a aplicação**, ou seja, antes do App estar `ready`, será feito um request para os links fornecidos abaixo.

Links utilizados como **input** (~1000 registros cada):

- https://storage.googleapis.com/juntossomosmais-code-challenge/input-backend.csv
- https://storage.googleapis.com/juntossomosmais-code-challenge/input-backend.json

## Desenvolvimento Full-stack

[Layout base](layout-desktop.jpg), possui os seguintes **requisitos obrigatórios**:
  
  - Uma tela de detalhe, apresentada ao clicar em um cliente;
  - Navegação entre as fotos dos clientes;
  - Filtros pela região e/ou classificação do cliente.

# Solução para o Desafio
- Uso do framework Spring MVC para desenvolvimento Front-end e Back-end da aplicação

- Para a resolução do Code Challenge foi decidido a estrategia de consumir os dados Json e Csv divididos pelas informações fornecidas de cada pessoa (Location, Name, Dob, Registered, Timezone, Coordinates, Picture) para então armazenar esses dados separadamente no banco de dados, assim tendo maior facilidade na hora de manipular os dados para representa-los nas paginas JSP e na criação da API

- Com a API feita e os dados armazenados no banco de dados, foi feita a recuperação desses dados em paginas JSP que foram divididas em filtros pela região (Norte, Nordeste, Centro-Oeste, Sul e Sudeste), por Coordenadas (Especial, Normal e Trabalhoso) e uma pagina Onde é retornado todos os dados daquela Pessoa
