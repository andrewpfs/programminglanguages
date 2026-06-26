-module(fib_app_recursive).
-export([fibonacci_recursive/1]).


fibonacci_recursive(Position) when Position =< 0 ->
    [1];
fibonacci_recursive(1) ->
    [1, 1];
fibonacci_recursive(Position) ->
    PrevList = fibonacci_recursive(Position - 1),
    NextValue = lists:sum(lists:nthtail(length(PrevList) - 2, PrevList)),
    PrevList ++ [NextValue].
