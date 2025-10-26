console.clear();
/* SETUP */
const scene = new THREE.Scene();
const camera = new THREE.PerspectiveCamera(
75,
window.innerWidth / window.innerHeight,
0.1,
5000
);
camera.position.z = 500;
const renderer = new THREE.WebGLRenderer();
renderer.setPixelRatio(window.devicePixelRatio > 1 ? 2 : 1);
renderer.setSize(window.innerWidth, window.innerHeight);
document.body.appendChild(renderer.domElement);
/* CONTROLS */
const controlsWebGL = new THREE.OrbitControls(camera, renderer.domElement);
/* PARTICLES */
// Create a global gsap timeline that contains all tweens
const tl = gsap.timeline({
repeat: -1,
yoyo: true
});
const path = document.querySelector("path");
const length = path.getTotalLength();
const vertices = [];
for (let i = 0; i < length; i += 0.1) {
const point = path.getPointAtLength(i);
const vector = new THREE.Vector3(point.x, -point.y, 0);
vector.x += (Math.random() - 0.5) * 30;
vector.y += (Math.random() - 0.5) * 30;
vector.z += (Math.random() - 0.5) * 70;
vertices.push(vector);
// Create a tween for that vector
tl.from(vector, {
x: 600 / 2, // Center X of the heart
y: -552 / 2, // Center Y of the heart
z: 0, // Center of the scene
ease: "power2.inOut",
duration: "random(2, 5)" // Random duration
},
i * 0.002 // Delay calculated from the distance along the path
);
}
const geometry = new THREE.BufferGeometry().setFromPoints(vertices);
const material = new THREE.PointsMaterial( { color: 0xee5282, blending: THREE.AdditiveBlending, size: 3 } );
const particles = new THREE.Points(geometry, material);
// Offset the particles in the scene based on the viewbox values
particles.position.x -= 600 / 2;
particles.position.y += 552 / 2;
scene.add(particles);
gsap.fromTo(scene.rotation, {
y: -0.2
}, {
y: 0.2,
repeat: -1,
yoyo: true,
ease: 'power2.inOut',
duration: 3
});
/* RENDERING */
function render() {
requestAnimationFrame(render);
// Update the geometry from the animated vertices
geometry.setFromPoints(vertices);
renderer.render(scene, camera);
}
/* EVENTS */
function onWindowResize() {
camera.aspect = window.innerWidth / window.innerHeight;