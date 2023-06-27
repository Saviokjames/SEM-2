
#!/bin/bash
x=10
y=5
if [[ $x -gt $y ]]
then
	echo "$x is greater than $y"
elif [[ $x -lt $y ]]
then 
	echo "$y is greater than $x"
else 
	echo "$x is equal to $y"
fi

