# Sistema de Gerenciamento de Pedidos

### Este projeto em Java consiste em um sistema de gerenciamento de pedidos, criado para praticar conceitos de Programação Orientada a Objetos (POO), encapsulamento e associações entre classes.

## Funcionalidades:

* Cadastro de clientes com nome, e-mail e data de nascimento.
* Criação de produtos com nome.
* Registro de pedidos com status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED).
* Adição de múltiplos itens a cada pedido, cada um associado a um produto.
* Cálculo automático do total do pedido somando os subtotais de cada item.
* Exibição de resumo completo do pedido com informações do cliente, itens e total formatado.

## Classes principais:

1. Client:

   * Atributos: name, email, birthDate.
   * Construtores: default e parametrizado.
   * Métodos: getters, setters e toString() formatado.

2. Product:

   * Atributo: name.
   * Construtores: default e parametrizado.
   * Métodos: getters e setters.

3. OrderItem:

   * Atributos: quantity, price, product.
   * Construtores: default e parametrizado.
   * Métodos: subTotal() e toString() formatado.

4. Order:

   * Atributos: date, status, client, lista de OrderItem.
   * Construtores: default e parametrizado.
   * Métodos: addItem(), removeItem(), total(), toString() formatado.

5. OrderStatus (enum):

   * Valores: PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED.

6. Main:

   * Ponto de entrada do programa.
   * Coleta de dados do cliente, status do pedido e itens via console.
   * Criação do pedido, adição de itens e exibição do resumo.

## Conceitos aprendidos:

* **Encapsulamento**: atributos privados com getters e setters.
* **Construtores**: uso do padrão default e parametrizado.
* **Associações entre classes**: Order -> Client, Order -> OrderItem, OrderItem -> Product.
* **Enumeração**: OrderStatus garante valores válidos para o status do pedido.
* **Composição**: Order contém múltiplos OrderItem.
* **Fluxo de programa**: coleta de dados do usuário, criação de objetos e interação entre classes.
* **Formatação de saída**: toString() personalizado para exibir informações legíveis.
* **Streams**: cálculo do total do pedido usando stream no método total().

## Aprendizado extra:

* Importância de criar objetos no escopo correto para não sobrescrever dados.
* Estruturação de um programa principal limpo e legível.
* Preparação para futuros aprimoramentos, como validação de entradas e tratamento de exceções.

# Conclusão:
Este projeto serve como base sólida para praticar POO e associações entre classes em Java, mostrando como modelar entidades do mundo real (clientes, produtos, pedidos) de forma organizada e funcional.
