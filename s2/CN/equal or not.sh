#!/bin/bash
echo "Enter the first number and second number : "
read a
read b
if [ $a == $b ]
then
        echo "The number $a and $b are equal"
else
        echo "The number $a and $b are not equal"
fi
