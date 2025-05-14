# WhatsApp App (Exemplo OO em Java)
Este projeto demonstra conceitos de Orientação a Objetos (Herança, Agregação e Composição) simulando um aplicativo de mensagens semelhante ao WhatsApp.

## Estrutura do Projeto
- **README.md**: Documentação para compilar e executar o aplicativo.
- **src/**: Código-fonte em Java no package `com.example.whatsapp`.

## Como Compilar e Executar
1. **Pré-requisitos**: Java 23+ instalado e variável `JAVA_HOME` configurada.
2. No terminal, navegue até a raiz do projeto:
   ```bash
   cd Implementacao_Whatsapp/
   ```
3. Compile o código:
   ```bash
   javac -d out src/com/example/whatsapp/*.java
   ```
4. Execute a aplicação de exemplo:
   ```bash
   java -cp out com.example.whatsapp.Whatsapp
   ```

## Descrição dos Pacotes e Classes
- **com.example.whatsapp.Contact**: Representa um contato com nome e telefone.
- **com.example.whatsapp.Message** (abstrata): Classe base para diferentes tipos de mensagem.
- **com.example.whatsapp.TextMessage, ImageMessage, AudioMessage, VideoMessage**: Implementações concretas de mensagem, usando herança e composição.
- **com.example.whatsapp.Media**: Armazena dados binários (byte[]) e tipo MIME para mensagens multimídia.
- **com.example.whatsapp.Whatsapp**: Classe principal que agrega contatos e mensagens.

## Exemplo de Uso
No método `main` de `Whatsapp.java`, criamos dois contatos e enviamos uma `TextMessage`:
```java
Whatsapp app = new Whatsapp();
Contact alice = new Contact("Alice", "+5511999990000");
Contact bob = new Contact("Bob", "+5511988880000");
app.addContact(alice);
app.addContact(bob);
TextMessage msg = new TextMessage(alice, "Olá, Bob!");
app.sendMessage(msg);
```
Saída esperada:
```
Alice: Olá, Bob!
```
