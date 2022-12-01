import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTests{
Fibonacci fibonacci;
String result;
String valido = "numero válido";
String invalido = "numero inválido";
/* Implementação do caso de teste < "a", "numero invalido" >
[caracter] */
//Como o parâmetro da função é int ele n compilaria, por isso o comentário
@Before
  public void init(){
      //cria o objeto da classe (unidade) a ser testada
      fibonacci = new Fibonacci();
      result = "";
  }

/*@Test
public void casoTeste1 (){
   // result = fibonacci.calculaFib("a");
    assertEquals(invalido, result); //faz o papel do oráculo
}*/

/** Implementação do caso de teste <0, Fib(0) = 0> [limite
inferior] */
@Test
public void casoTeste2 (){
    result = fibonacci.calculaFib(0);
    assertEquals("Fib(0) = 0", result);
}
/** Implementação do caso de teste <40, Fib(40) = 102334155>
[limite superior] */
@Test
public void casoTeste3 (){
    result = fibonacci.calculaFib(40);
    assertEquals("Fib(40) = 102334155", result); //faz o papel do oráculo
}


/** Implementação do caso de teste < -1, "numero invalido">
[subsequente do limite inferior] */
@Test
public void casoTeste7 (){
    result = fibonacci.calculaFib(-1);
    assertEquals("numero invalido", result); //faz o papel do oráculo
}

/** Implementação do caso de teste < 41, "numero invalido">
[subsequente do limite superior] */
@Test
public void casoTeste8 (){
    result = fibonacci.calculaFib(41);
    assertEquals("numero invalido", result); //faz o papel do oráculo
}
}
