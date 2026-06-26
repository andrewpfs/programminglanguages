module FibonacciAppRecursiveIterative (fiboAppRecursiveIterative) where

fiboAppRecursiveIterative position = accumulateFibo position [1, 1]
  where
    accumulateFibo 0 _ = [1]
    accumulateFibo 1 list = list
    accumulateFibo n list =
      let currentList = list ++ [sum (drop (length list - 2) list)]
      in accumulateFibo (n - 1) currentList
