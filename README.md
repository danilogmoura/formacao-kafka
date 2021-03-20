### Formação Apache Kafka

------

[Cursos Apache Kafka | Formação | Alura](https://www.alura.com.br/formacao-kafka)

#### Conteúdo programático

#### Produtores, Consumidores e streams

1. Produtores e consumidores

- [x] Mensageria e Kafka
- [x] Instalando o Kafka localmente
- [x] Criando produtores em Java
- [x] Criando consumidores em Java
- [x] Produtores x Consumidores

2. Paralelizando tarefas em um serviço

- [x] Vários consumidores e produtores
- [x] Paralelizando e a importância das keys
- [x] Max poll e dando mais chances para auto commit

3. Criando nossa camada

- [x] Extraindo uma camada de consumidor
- [x] Extraindo nossa camada de producer

4. Serialização customizada

- [x] Diretórios do Kafka e Zookeeper
- [x] Serialização com GSON
- [x] Migrando o log
- [x] Deserialização customizada
- [x] Lidando com customizações

5. Microsserviços e módulos

- [x] Microsserviços como módulos em um mono repo
- [x] Binários dos microsserviços

#### Fast delegate, evolução e cluster de brokers

1. Novos produtores e consumidores

- [x] Produtores consumidores e o eager de patterns
- [x] Um serviço que acessa bancos externos

2. Evoluindo um serviço

- [x] Evoluindo serviços e schemas
- [x] Escolhendo o id adequado

3. Servidor HTTP

- [x] Usando um servidor http como ponto de entrada
- [x] Fast delegate

4. Cluster de brokers

- [x] Single point of failure do broker
- [x] Replicação em cluster
- [x] Cluster de 5 brokers e explorando líderes e réplicas
- [x] Acks e reliability

#### Batches, correlation ids e dead letters

1. Batch

- [x] Simulando a geração de relatórios
- [x] Generalização de processo de batch assíncrono e http fast delegate
- [x] Batch assíncrono em execução

2. Serialização e deserialização customizada

- [x] A importância de um CorrelationId
- [x] A serialização customizada com correlation id e um wrapper
- [x] Deserialização customizada

3. CorrelationID

- [x] Implementando o correlation id

4. Arquitetura e falhas até agora

- [x] Revisando a arquitetura até agora
- [x] Revisando o rebalanceamento

5. Assincronicidade, retries e deadletters

- [x] Retries e assincronicidade
- [x] Enviando mensagem de deadletter

#### Idempotência e garantias

1. Organização e serviços de email

- [x] Organização e lidando com múltiplos tópicos de envio em um mesmo serviço
- [x] Micro serviços de email e fast delegate real

2. Camada de serviços

- [x] Extraindo uma camada de serviços
- [x] Paralelizando com pools de threads
- [X] Facilidade de criar novos serviços

3. Commits e offsets

- [x] Offset latest e earliest

4. Lidando com mensagens duplicadas

- [x] O problema da mensagem duplicada
- [x] Kafka transacional

5. Idempotência

- [x] Id natural e idempotência no banco
- [x] Extraindo o common database
- [x] Idempotência e fast delegate
- [x] Idempotência em apis