#!/bin/bash

echo -e "\n Directory of $(pwd)\n"

for item in *; do
    if [ ! -e "$item" ]; then
        continue
    fi

    datetime=$(date -r "$item" +"%d/%m/%Y  %I:%M %p")

    if [ -d "$item" ]; then
        printf "%-20s <DIR>           %s\n" "$datetime" "$item"
    else
        size=$(stat --format="%s" "$item")
        printf "%-20s %15d %s\n" "$datetime" "$size" "$item"
    fi
done
