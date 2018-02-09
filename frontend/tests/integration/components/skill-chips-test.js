import { moduleForComponent, test } from 'ember-qunit';
import hbs from 'htmlbars-inline-precompile';

moduleForComponent('skill-chips', 'Integration | Component | skill chips', {
  integration: true
});

test('it renders', function(assert) {
  // Set any properties with this.set('myProperty', 'value');
  // Handle any actions with this.on('myAction', function(val) { ... });

  this.render(hbs`{{skill-chips}}`);

  assert.equal(this.$().text().trim(), '');

  // Template block usage:
  this.render(hbs`
    {{#skill-chips}}
      template block text
    {{/skill-chips}}
  `);

  assert.equal(this.$().text().trim(), 'template block text');
});
