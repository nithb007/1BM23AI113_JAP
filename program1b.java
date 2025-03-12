//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class program1b {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=8;i++)
        {
            for(j=i;j<=8+(i-1);j++)
            {
                if(j%2==0)
                {
                    System.out.print("W ");
                }
                else
                {
                    System.out.print("B ");
                }

            }
            System.out.println();
        }
    }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

}