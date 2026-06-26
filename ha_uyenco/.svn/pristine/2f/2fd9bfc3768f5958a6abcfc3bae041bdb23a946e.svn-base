-module(fib_app_recursive_iterative).
-export([fibonacci_recursive_and_iterative/1]).

fibonacci_recursive_and_iterative(Position) ->
  fibonacci_recursive_and_iterative(Position, [1, 1]).

fibonacci_recursive_and_iterative(0, _) ->
  [1];
fibonacci_recursive_and_iterative(1, List) ->
  List;
fibonacci_recursive_and_iterative(Position, List) ->
	NewList = List ++ [lists:sum(lists:nthtail(length(List) - 2, List))],
  fibonacci_recursive_and_iterative(Position - 1, NewList).
