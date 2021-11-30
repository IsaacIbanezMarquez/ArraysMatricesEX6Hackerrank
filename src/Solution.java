

import java.io.*;
import java.util.*;

// Seleccionats pel Programame

/* Buscant una manera objectiva de seleccionar alumnes disposats a representar el 1r de DAM en el famós concurs del Programame es demana que es sel·leccioni aquells que tinguin una nota igual o superior a la mitjana de la classe.

L'entrada serà una dupla nom i nota i s'espera que es tregui a la sortida aquells alumnes que superin la nota mitjana de la classe.

Input Format

Entrem un N:enter tamany d'alumnes i notes. Anem entrant cada alumne amb la seva corresponent nota.

Constraints

No n'hi ha.

Output Format

S'imprimeix el nom d'aquells alumnes que superen la nota mitjana de la classe.

Sample Input 0

5
Ramon 10
Joan 5.0
Marta 7.7
Maria 6.5
Mireia 9.5
Sample Output 0

Ramon
Mireia
Explanation 0

Calculem la mitjana de les notes i resulta que és un 7.74, per tant aquells alumnes que superen la mitjana són la Mireia i el Ramon

Submissions: 26
Max Score: 3
Difficulty: Medium
Rate This Challenge:


More

 */

public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Grosor = sc.nextInt();
        String [] Alumnos = new String [Grosor];
        double [] Notas = new double [Grosor];
        double Suma = 0;

        for (int i = 0; i < Grosor; i++)
        {
            Alumnos[i] = sc.next();
            Notas[i] = sc.nextDouble();
            Suma = Suma + Notas[i];
        }
        double Media = Suma / Grosor;

        for (int i = 0; i < Grosor;i++)
        {
            if (Notas[i] >= Media)
            {
                System.out.println(Alumnos[i]);
            }
        }
    }
}
