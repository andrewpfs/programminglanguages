-module(fib_app_recursive_test).
-include_lib("eunit/include/eunit.hrl").

fibonacci_series_test() ->
  ?assertEqual([1], fib_app_recursive:fibonacci_recursive(0)),
  ?assertEqual([1, 1], fib_app_recursive:fibonacci_recursive(1)),
  ?assertEqual([1, 1, 2], fib_app_recursive:fibonacci_recursive(2)),
  ?assertEqual([1, 1, 2, 3], fib_app_recursive:fibonacci_recursive(3)),
  ?assertEqual([1, 1, 2, 3, 5, 8], fib_app_recursive:fibonacci_recursive(5)),
  ?assertEqual([1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89], fib_app_recursive:fibonacci_recursive(10)).
