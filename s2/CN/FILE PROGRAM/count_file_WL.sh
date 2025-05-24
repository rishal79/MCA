if [ $# -ne 1 ]; then
    echo "Usage: $0 <filename>"
    exit 1
fi

file="$1"

if [ ! -f "$file" ]; then
    echo "Error: '$file' not found."
    exit 1
fi

lines=$(wc -l < "$file")
words=$(wc -w < "$file")

echo "File: $file"
echo "Lines: $lines"
echo "Words: $words"

#l=line w=word
