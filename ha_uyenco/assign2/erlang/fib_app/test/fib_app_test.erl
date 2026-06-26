-module(fib_app_test).
-include_lib("eunit/include/eunit.hrl").

fibonacci_series_test() ->
  ?assertEqual([1], fib_app:fib_series(0)),
  ?assertEqual([1, 1], fib_app:fib_series(1)),
  ?assertEqual([1, 1, 2], fib_app:fib_series(2)),
  ?assertEqual([1, 1, 2, 3], fib_app:fib_series(3)),
  ?assertEqual([1, 1, 2, 3, 5, 8], fib_app:fib_series(5)),
  ?assertEqual([1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89], fib_app:fib_series(10)).
