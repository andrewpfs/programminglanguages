for n in 1 4 7 10; do
 ruby -r './factorialSeries' -e "puts factorial($n).join(', ')"
done