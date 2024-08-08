public class Selection_Sort {
    public static void main(String[] args) {
        int [] a={5,3,1,4,2};
        for(int i =0 ;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int smallest=i;
                if(a[i]>a[j])
                {
                    smallest=j;
                }
                int temp=a[smallest];
                    a[smallest]=a[i];   
                    a[i]=temp; 
            }    
        }
        for(int i =0 ;i<a.length;i++)
        {
            System.out.print(a[i]+ "|");
        }
    }
}
