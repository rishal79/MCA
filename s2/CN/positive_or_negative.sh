#!bin/bash

clear
read -p "enter the number" num
if [ $num -gt 0 ]
then
	echo "$num is positive"
else
	echo "$num is negative"
fi
