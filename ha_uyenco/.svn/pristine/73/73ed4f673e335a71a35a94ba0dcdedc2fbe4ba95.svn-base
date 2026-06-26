require "minitest/autorun"
require_relative "../main/perfect_number_checker_functional"

class IsPerfectNumberFunctionalTest < Minitest::Test
  def test_perfects
    assert (functional_is_perfect_number?(6))
    assert (functional_is_perfect_number?(28))
    assert (functional_is_perfect_number?(496))
    assert (functional_is_perfect_number?(8128))
  end

  def test_non_perfects
    refute (functional_is_perfect_number?(5))
    refute (functional_is_perfect_number?(12))
    refute (functional_is_perfect_number?(1))
    refute (functional_is_perfect_number?(10))
    refute (functional_is_perfect_number?(-1))
  end
end
