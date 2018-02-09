import DS from 'ember-data';

export default DS.Model.extend({
  image: DS.attr('file'),
  imagePath:DS.attr()
});
