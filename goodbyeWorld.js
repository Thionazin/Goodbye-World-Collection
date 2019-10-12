const fs = require('fs');

fs.unlink('./goodbyeWorld.js', (err) => {
  if (err) throw err;
  console.log('Goodbye World!');
});
