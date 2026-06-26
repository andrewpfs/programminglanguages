defmodule NumberGame.MixProject do
  use Mix.Project

  def project do
    [
      app: :numbergenerator,
      version: "0.1.0",
      elixir: "~> 1.19",
      start_permanent: Mix.env() == :prod,
      escript: [main_module: NumberGameApp],
      deps: deps()
    ]
  end

  # Run "mix help compile.app" to learn about applications.
  def application do
    [
      extra_applications: [:logger]
    ]
  end

  # Run "mix help deps" to learn about dependencies.
  defp deps do
    [
      {:ecto_sql, "~> 3.0"},  
      {:postgrex, ">= 0.0.0"}  
    ]
  end
end
