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

- [ ] Diretórios do Kafka e Zookeeper
- [ ] Serialização com GSON
- [ ] Migrando o log
- [ ] Deserialização customizada
- [ ] Lidando com customizações

5. Microsserviços e módulos

- [ ] Microsserviços como módulos em um mono repo
- [ ] Binários dos microsserviços

#### Fast delegate, evolução e cluster de brokers

1. Novos produtores e consumidores

- [ ] Produtores consumidores e o eager de patterns
- [ ] Um serviço que acessa bancos externos

2. Evoluindo um serviço

- [ ] Evoluindo serviços e schemas
- [ ] Escolhendo o id adequado

3. Servidor HTTP

- [ ] Usando um servidor http como ponto de entrada
- [ ] Fast delegate

4. Cluster de brokers

- [ ] Single point of failure do broker
- [ ] Replicação em cluster
- [ ] Cluster de 5 brokers e explorando líderes e réplicas
- [ ] Acks e reliability

#### Batches, correlation ids e dead letters

1. Batch

- [ ] Simulando a geração de relatórios
- [ ] Generalização de processo de batch assíncrono e http fast delegate
- [ ] Batch assíncrono em execução

2. Serialização e deserialização customizada

- [ ] A importância de um CorrelationId
- [ ] A serialização customizada com correlation id e um wrapper
- [ ] Deserialização customizada

3. CorrelationID

- [ ] Implementando o correlation id

4. Arquitetura e falhas até agora

- [ ] Revisando a arquitetura até agora
- [ ] Revisando o rebalanceamento

5. Assincronicidade, retries e deadletters

- [ ] Retries e assincronicidade
- [ ] Enviando mensagem de deadletter

#### Idempotência e garantias

1. Organização e serviços de email

- [ ] Organização e lidando com múltiplos tópicos de envio em um mesmo serviço
- [ ] Micro serviços de email e fast delegate real

2. Camada de serviços

- [ ] Extraindo uma camada de serviços
- [ ] Paralelizando com pools de threads
- [ ] Facilidade de criar novos serviços

3. Commits e offsets

- [ ] Offset latest e earliest

4. Lidando com mensagens duplicadas

- [ ] O problema da mensagem duplicada
- [ ] Kafka transacional

5. Idempotência

- [ ] Id natural e idempotência no banco
- [ ] Extraindo o common database
- [ ] Idempotência e fast delegate
- [ ] Idempotência em apis