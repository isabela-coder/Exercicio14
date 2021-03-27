
package exercicio14;

import java.util.Scanner;


public class Exercicio14 {

    
    public static void main(String[] args) {
       
        
        float minimo;//valores que serao pegos pelo teclado
        float kw;//valores que serao pegos pelo teclado
        float custo;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do salario minimo");
        minimo = Float.parseFloat(leia.nextLine());
        System.out.println("Digite o valor de quilowatt");
        kw = Float.parseFloat(leia.nextLine());
        custo = minimo/5/100;
        System.out.println("1 kw custa R$ "+custo);
        System.out.println("O preço a ser pago é de  "+custo*kw);
        System.out.println("Com o desconto de 15% o preço fica em R$ "+custo*kw/100*85 );
    }
    
    
}
