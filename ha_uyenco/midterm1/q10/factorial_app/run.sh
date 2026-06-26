for n in 1 4 7 10; do
 ruby -r './factorial' -e "puts factorial($n).join(', ')"
done
