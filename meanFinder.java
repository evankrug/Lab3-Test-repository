public class meanFinder
{
    private int count;

    public meanFinder(int number[])
    {
		if(number.length() == 0)
			return -1;
		int sum = 0;
		for(int i = 0; i < number.length(); i++)
			sum = sum + number[i];
		return sum/number.length();
    }
	
	public static void main(String[] args)
	{
		int[] data = [2, 3, 9, 5, 48, 6, 4, 6, 15, 26, 38, 75, 56];
		println(meanFinder(data))
	}
}
