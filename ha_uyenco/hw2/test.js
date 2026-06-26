const user = {
  age: 19
};
const { profile: { name = "Andrew" } } = user;
console.log(name)