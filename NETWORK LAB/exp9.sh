
#!/bin/bash
i=o
sum=0
while(( i<10 ));
do
	((sum=sum+i))
	((i=i+1))
done
echo $sum
