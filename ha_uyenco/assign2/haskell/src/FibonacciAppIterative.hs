module FibonacciAppIterative (fiboAppIterative) where

fiboAppIterative 0 = [1]
fiboAppIterative position =
  foldl (\acc elem -> 
      let nextValue = sum (drop (length acc - 2) acc)
  in acc ++ [nextValue])
  [1, 1]
  [1 .. position-1]

