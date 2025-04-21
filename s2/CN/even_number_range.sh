#!/bin/bash
clear
read -p "Enter the range : " i n
echo -n "Even numbers : "
for (( ; i<=n;i++ ))
do
	if (( $i % 2 == 0 ))
	then
		echo -n " $i "
	fi
done