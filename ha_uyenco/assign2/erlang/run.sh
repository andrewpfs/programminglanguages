cd fib_app
rm -rf _build .rebar3
rebar3 clean
rebar3 compile
rebar3 eunit --verbose
