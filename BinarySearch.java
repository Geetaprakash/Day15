import java.util.Arrays;  
class BinarySearch{  
    public static void main(String args[]){  
        int arr[] = {3,11,16,22,30,40,56,70,60,95,65,63,67}; 
	int find=30;
	//firstposition/index value 0
	int firstpos=0;
	//Lastposition/index 12
	int lastpos=arr.length-1;
	int midIndex=(firstpos+lastpos)/2;
 	while(firstpos <= lastpos)
	{		  
	if(arr[midIndex] == find)
		{
			System.out.println("element is "+midIndex+" index position");
			break;
		}
		else if(arr[midIndex] < find) {
		firstpos=midIndex+1;
		}
		else  {
			lastpos=midIndex-1;
			}
		midIndex=(firstpos+lastpos)/2;
	}
	if(firstpos>lastpos)
	{
		System.out.println("element not found");
	}
	
}
}