package aiite.smalltasks;

public class DupicatesRemovalArray {

	public static void main(String[] args) {
		int j,temp;
        int num[]={97,54,97,75,54};
        
        for(int i=0;i<num.length;i++)
        {
            for(j=i+1;j<num.length;j++)
            {
                if(num[i]>num[j])
                {
                temp=num[i];
                num[i] = num[j];
                num[j] = temp;
                }
            }
        }
        System.out.println("After removed :- ");
        System.out.println(num[0]);
        for(int i=1;i<num.length;i++){
            if(num[i]==num[i-1]){
                continue;
            }
            else{
                System.out.println(num[i]);
            }
        } 


	}

}
