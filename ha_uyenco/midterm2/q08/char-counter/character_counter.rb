def character_counter(string, pos = 0, as = 0, ks = 0, es = 0, ws = 0)
  if pos == string.length
    puts "A: #{as}"
    puts "K: #{ks}"
    puts "E: #{es}"
    puts "W: #{ws}"
    return
  end
    
  case string[pos]
  when 'A'
    character_counter(string, pos + 1, as + 1, ks, es, ws)
  when 'K'
    character_counter(string, pos + 1, as, ks + 1, es, ws)
  when 'E'
    character_counter(string, pos + 1, as, ks, es + 1, ws)
  when 'W'
    character_counter(string, pos + 1, as, ks, es, ws + 1)
  else
    character_counter(string, pos + 1, as, ks, es, ws)   
  end   
end


string = ARGV[0]
puts "String: #{string}"
character_counter(string)
