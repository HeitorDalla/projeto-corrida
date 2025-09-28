# 🏎️ Simulação Básica de Corrida (Java)

Este é um mini projeto em Java que simula alguns elementos fundamentais de um ambiente de corrida, através de classes de domínio que modelam carros, pistas, equipes e outros componentes relacionados.

---

## 📂 Estrutura de Pacotes

- `src.br.edu.unicesumar.classes` → Contém todas as classes de modelo (entidades) do projeto.

---

## 🛠️ Classes e Modelagem de Entidades

O projeto é construído em torno das seguintes classes, cada uma representando uma entidade-chave no contexto de uma corrida:

---

### 1. `Carro.java`

Representa o veículo de corrida, modelando suas características e as ações básicas de pilotagem.

#### Atributos

| Atributo   | Descrição                                                                 |
|-----------|--------------------------------------------------------------------------|
| potencia  | Influencia o ganho de velocidade ao acelerar.                            |
| aderencia | Determina a chance de sucesso em uma curva (quanto maior, menor chance de derrapar). |
| frenagem  | Influencia a perda de velocidade ao frear.                               |
| velocidade| A velocidade atual do carro.                                             |

#### Métodos

| Método     | Descrição                                                      |
|-----------|----------------------------------------------------------------|
| acelerar() | Aumenta a velocidade com base na potencia.                    |
| frear()    | Reduz a velocidade com base na frenagem.                      |
| curva()    | Simula uma curva. A chance de derrapar é calculada usando `Math.random()` contra o valor da aderencia. |

---

### 2. `Pista.java`

Define as características do local da corrida.

#### Atributos

| Atributo   | Descrição                                   |
|-----------|---------------------------------------------|
| nome      | Nome da pista.                              |
| distancia | Distância total da pista.                   |
| tipoPista | Tipo de superfície da pista (ex: Asfalto, Terra). |
| clima     | Condição climática atual.                   |
| toString()| Exibe formatadamente todas as informações da pista. |

---

### 3. `Jogador.java` e `Equipe.java`

Representam o competidor e sua equipe de suporte.

| Classe   | Atributos Principais | Observações |
|---------|--------------------|------------|
| Jogador | id, nome, idade     | Atenção: Os métodos `getRoupa()` e `getMarca()` retornam os atributos nome e idade, respectivamente. Recomenda-se corrigir a nomenclatura para maior clareza. |
| Equipe  | id, roupa, marca    | Implementação padrão de getters para os atributos da equipe. |

---

### 4. `TipoCorrida.java` e `Bandeiras.java`

Classes auxiliares para definir regras e sinalizações da corrida.

| Classe       | Atributos                              |
|-------------|---------------------------------------|
| TipoCorrida | nome e categoria (modalidade da corrida). |
| Bandeiras   | cor e formato (referentes às bandeiras de sinalização). |

---

## 💡 Próximos Passos

A lógica para a simulação de uma corrida completa, incluindo a interação entre todas essas entidades, deve ser implementada na classe `Main.java`.
