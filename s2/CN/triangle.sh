#!/bin/bash

echo "Enter 3 sides of the triangle:"
read a b c

if [[ $a -eq $b && $b -eq $c ]]; then
  echo "Equilateral"
elif [[ $a -eq $b || $a -eq $c || $b -eq $c ]]; then
  echo "Isosceles"
else
  echo "Scalene"
fi
