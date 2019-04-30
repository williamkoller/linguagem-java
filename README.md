
# Java com Dockerfile

<h4>Criar um arquivo Dockerfile com as configurações abaixo<h4/>
  <h6>
    FROM java:8  
    <br>
    COPY . /var/www/java  
    <br>
    WORKDIR /var/www/java  
    <br>
    RUN javac Hello.java  
    <br>
    CMD ["java", "Hello"]  
  <h6/>
    
<h5>Entrar na pasta raiz aonde está o arquivo Dockerfile<h5/>
<p>Rodar o comando => docker build -t java-app .<p/>
<p>Rodar o comando => docker run java-app<p/>
