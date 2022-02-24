> run() : é o código que a thread executará.

> start() : sinaliza à JVM que a thread pode ser executada, mas saiba que essa execução não é garantida quando esse método é chamado, e isso pode depender da JVM.

> isAlive(): volta true se a Thread está sendo executada e ainda não terminou.

> sleep(): suspende a execução da thread por um tempo determinado.

> yield() : torna o estado de um Thread executável para que a thread com prioridades equivalentes possam ser processadas.

> currentThread(): é um método estático

> da classe Thread que volta qual a thread que está sendo executada.

> getName(): retorna o nome da Thread: o nome da thread pode ser especificado como segundo argumentos ou através do setName() pois existem os construtores sobrecaregados.