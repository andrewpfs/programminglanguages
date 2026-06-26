-module(fib_app).
-export([fib_series/1]).

fib_series(Position) when Position =< 0 ->
    [1];
fib_series(1) ->
    [1, 1];
fib_series(Position) ->
    lists:foldl(
      fun(_, Series) ->
          NextValue = lists:sum(lists:nthtail(length(Series) - 2, Series)),
          Series ++ [NextValue]
      end,
      [1, 1],
      lists:seq(3, Position + 1)
    ).
