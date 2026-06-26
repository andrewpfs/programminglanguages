require "minitest/autorun"
require_relative "../main/perfect_number_checker"

class IsPerfectNumberTest < Minitest::Test
  def test_perfects
    assert (is_perfect_number?(6))
    assert (is_perfect_number?(28))
    assert (is_perfect_number?(496))
    assert (is_perfect_number?(8128))
  end

  def test_non_perfects
    refute (is_perfect_number?(5))
    refute (is_perfect_number?(12))
    refute (is_perfect_number?(1))
    refute (is_perfect_number?(10))
    refute (is_perfect_number?(-1))
  end
end
