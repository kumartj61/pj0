
class prime{
	
	static final int[][] arr_final={{1,2,3},{4,5,6},{7,8,9}};//global array
	static int[][] arr_flag={{0,0,0},{0,0,0},{0,0,0}};
	static int count=0;
	
	

	static boolean is_prime(int a ,int b){
		int flag=0;	      
		int sum=a+b;    
		int m=sum/2;      
		
		if(sum==0||sum==1){  
			return false;      
		}
		else{  
			for(int i=2;i<=m;i++){      
				if(sum%i==0){      
					return true;      
				}		      
			}      
			if(flag==0)  
			{ return true ;}  
		}return false;
	}
	
	static boolean is_valid(int[][] arr){
		boolean flag = false;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
			
				
				if(arr_final[i][j]!=arr[i][j]){
					arr_flag[i][j]=0;
					flag=false;
				}
				else
					arr_flag[i][j]=1;
			}
		}
		if(flag==false)
			return false;
		return true;
	
	}
	
	static int[][] swap(int[][] arr_s,int ii,int ij,int kk,int kl){
		int temp=arr_s[ii][ij];
		arr_s[ii][ij]=arr_s[kk][kl];
		arr_s[kk][kl]=temp;
		count=count++;
		return arr_s;
	}
	
	static void disp(int[][] arr_d){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(arr_d[i][j]);
			System.out.print("\n");
		}
	}
	
	static int[][] comb(int[][] arr_c){
		int a,b;
		for(int i =0; i<3;i++ ){
			for(int j=0; j<3; j++){
			if(!is_valid(arr_c)){
				System.out.println("not valid");
				if(is_prime(arr_c[0][0],arr_c[0][1])){
					arr_c=swap(arr_c,0,0,0,1);
				}
				else if(is_prime(arr_c[0][0],arr_c[1][0])){
					arr_c=swap(arr_c,0,0,1,0);
				}
			    else if(is_prime(arr_c[0][1],arr_c[0][2])){
					arr_c=swap(arr_c,0,1,0,2);
				}
				else if(is_prime(arr_c[0][1],arr_c[1][1])){
					arr_c=swap(arr_c,0,1,1,1);
				}
				else if(is_prime(arr_c[0][2],arr_c[1][2])){
					arr_c=swap(arr_c,0,2,1,2);
				}
				else if(is_prime(arr_c[1][0],arr_c[1][1])){
					arr_c=swap(arr_c,1,0,1,1);
				}
				else if(is_prime(arr_c[1][0],arr_c[2][0])){
					arr_c=swap(arr_c,1,0,2,0);
				}
				else if(is_prime(arr_c[1][1],arr_c[1][2])){
					arr_c=swap(arr_c,1,1,1,2);
				}
				else if(is_prime(arr_c[1][1],arr_c[2][1])){
					arr_c=swap(arr_c,1,1,2,1);
				}
				else if(is_prime(arr_c[1][2],arr_c[2][2])){
					arr_c=swap(arr_c,1,2,2,2);
				}
				else if(is_prime(arr_c[2][0],arr_c[2][1])){
					arr_c=swap(arr_c,2,0,2,1);
				}
				else if(is_prime(arr_c[2][1],arr_c[2][2])){
					arr_c=swap(arr_c,2,1,2,2);
				}
				
				
				/*if(is_prime(arr_c[i][j],arr_c[i][j+1])){
					a=arr_c[i][j];
					b=arr_c[i][j+1];
					arr_c=swap(arr_c,i,j,i,j+1);
				
				}*/
			}	
	
		}
	}
		return arr_c;
	} 
	
	public static void main(String a[]){
		int[][] arr={{3,2,1},{7,5,9},{4,8,6}};
		System.out.println(is_prime(arr[0][0],arr[0][1]));
		System.out.println(is_valid(arr));
		disp(arr);
		//arr=swap(arr,0,0,1,2);
		//System.out.println("After swapping");
		//disp(arr);
		System.out.println("flag after checking");
		disp(arr_flag);
		System.out.println(is_valid(arr));
		disp(arr_flag);
		arr=comb(arr);
		
		disp(arr);
		}
	

}