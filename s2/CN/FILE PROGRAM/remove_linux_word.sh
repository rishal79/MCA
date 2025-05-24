#!/bin/bash

# Check argument count
if [ $# -ne 2 ]; then
    echo "Usage: $0 <word> <filename>"
    exit 1
fi

word="$1"
file="$2"

# Check if file exists
if [ ! -f "$file" ]; then
    echo "Error: '$file' not found."
    exit 1
fi

# Remove lines containing the word
grep -vwi "$word" "$file" > temp && mv temp "$file"


#-v	Inverts the match — selects lines that do NOT match the word.
#-w	Matches the whole word only (not part of another word).
#-i case sensitive