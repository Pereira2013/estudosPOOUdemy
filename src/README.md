# PROGRAMAÇÃO ORIENTADA A OBJETO.

## Classe
- É um tipo estruturado que pode conter (membros):
    - Atributos (dados / campos)
    - Métodos (funcões / operacões)
* A classe também pode prover muitos outros recursos, tais como:
    - Construtores 
    - Sobrecarga
    - Encapsulamento
    - Heranca
    -  Polimorfismo

- Exemplos: 
    - Entidades: Produto, Cliente, Triangulo
    - Servicos: ProdutoService, ClienteService, EmailService, StorageService
    - Controladores: ProdutoController, ClienteController
    - Utilitários: Calculadora, Compactador
    - Outros (views, repositórios, gerenciadores, etc.)
![img.png](img.png)

## Classes, objetos, atributos
- classe: é a definicão do tipo.
- Objetos: são instâncias da classe.

![img_1.png](img_1.png)

### Discussão: 

Quais os benefícios de se calcular a área de um triângulo por meio de uma MÉTODO 
dentro da CLASSE Triangle?

1) Reaproveitamento de código: nós eliminamos o código repetido (cálculo das áreas
dos trŝngulod x e y) no programa principal.
2) Delegacão de responsabilidades: quem deve ser responsável por saber como calcular a área
de um triângulo é o próprio triângulo. A lógica do cálculo da área não deve estar em
outro lugar.

isso se chama principio de COESÃO.

# Segundo exercícios

![img_2.png](img_2.png)
![img_3.png](img_3.png)

### 
### Discussão
- Toda classe JAva é uma subclasse da classe Object
- Object possui os seguintes métodos:
  - getClass = retorna o tipo de objeto
  - equals = compara se o objeto é igual a outro
  - hashCode = retorna um código hash do objeto
  - toString = converte o objeto para string

## Menbros estéticos
- Também chamados membros de classe
  - Em oposicão a membros de instância
- São menbros que fazem sentido independetemente de objetos. Não precisam de objeto para serem chamados.
São chamados apartir do próprio nome da classe.

- Aplicacões comuns:
  - Classes utilitárias => Math.sqrt(double)
  - Declarocões de constantes

- Uma classe que possui somente membros estéticos, pode ser uma classe estética também. Esta classe não poderá 
ser instanciada.


# Construtores. palavra this, sobrecarga, encapsulamento

## Construtores:
 - É uma operacão especial da classe, que executa no momento da instanciacão do objeto
 - Usos comuns:
  - Iniciar valores dos atributos
  - Permitir ou obrigar que o objeto receba dados / dependências no momento de sua 
    instaciacão(Injecão de dependência)
 - Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
 ```sh
  Product p = new Product();
``` 
- É possivel especificar mais de um construtor na mesma classe (sobrecarga)


## Palavra this
- É uma referência para o próprio objeto
- Uso comuns:
  - Diferenciar atributos de variáveis locais
  - Passar o próprio objeto como argumento na chamada de um método ou construtor

![img_4.png](img_4.png)

## Sobrecarga (Construtores)
- É um recurso que uma classe possui de oferecer mais de uma operacão com o mesmo nome,
porém com diferentes listas de parâmetros.
- São construtores com da classe com parametros diferentes.

## Encapsulamento (getters e setters)
- É um princípio que consiste em esconder detalhes de implementaćão de uma classe,
expondo apenas operacões seguras que mantenham os objetos num estado consistente.
-  Regra de ouro: o objeto deve sempre estar num estado consistente, e a própria 
classe deve garantir isso.

  
  
   
