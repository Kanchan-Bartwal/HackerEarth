#include<stdio.h>
int main()
{
    long n,sum=0;
	scanf("%ld",&n);
	long a[n];
	for(int i=0;i<n;i++)
	{
		scanf("%ld",&a[i]);
		sum=sum+a[i];
	}
	printf("%ld",sum);
	return 0;
}
