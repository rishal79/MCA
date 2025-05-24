#!/bin/bash
clear
read -p "Enter the Value : " n
f=1
i=1
if [ $n -eq 0 ]
then
	echo "Factorial of $n : 1"
else
	while [ $i -le $n ]
        do
            f=$(( f * i ))
            i=$((i + 1))
        done
fi
echo "Factorial of $n is : $f"
